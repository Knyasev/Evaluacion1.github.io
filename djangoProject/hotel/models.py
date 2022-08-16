from select import select

from django.db import models

class Banio(models.Model):
    numero_duchas=models.PositiveSmallIntegerField(help_text="numero de duchas")
    banio_id=models.PositiveSmallIntegerField(primary_key="baño-id",help_text="numero de baño")
    elementos_de_aseo=models.CharField(max_length=50)

    def __str__(self):
        return 'Baño'



class Habitacion(models.Model):
    tipo_habitacion=models.CharField(max_length=50)
    numero_camas= models.PositiveIntegerField(null = False,blank=False,help_text="Ingrese el numero de camas de la Habitacion")
    numero_banios=models.PositiveIntegerField(null = False,blank=False,help_text="Ingrese el numero de baños de la Habitacion")
    posee_mirador=models.BooleanField()
    precio_habitacion=models.FloatField()
    numero_habitacion= models.PositiveIntegerField(null = False,blank=False,primary_key="habitacion-id")
    banio_list=models.ManyToManyField(Banio, blank=True,related_name= 'banio_list')
    precio_banio= models.PositiveIntegerField(blank=True,null = False)


    def __str__(self):
        return self.tipo_habitacion


    def CalcularPrecioHabitacion(self):
        if(self.numero_banios==2):
                return self.precio_banio+ self.precio_habitacion
        elif(self.numero_banios==1):
                return self.precio_banio+self.precio_habitacion

class ReservacionComida(models.Model):
    almuerzo=models.CharField(max_length=150)
    cena=models.CharField(max_length=150)
    desayuno=models.CharField(max_length=150)
    precio_almuerzo=models.FloatField()
    precio_desayuno=models.FloatField()
    precio_cena=models.FloatField()
    desea_almuerzo=models.BooleanField()
    desea_cena=models.BooleanField()
    desea_desayuno=models.BooleanField()
    reservacion_id=models.CharField(max_length=100,primary_key="reservacion-id")

    def __str__(self):
        return 'Reservacion #'+self.reservacion_id+ ':'+' Cena : ' + self.cena + "  Desayuno : "\
               + self.desayuno +" Almuerzo : "+ self.almuerzo


    def precioComidaPorHuesped(self,Reservacion ):
         numeros_dias=Reservacion.tiempo_estancia
         if(self.desea_almuerzo==True):
             num1=self.precio_almuerzo*Reservacion.numero_huestes
             num1=num1*Reservacion.tiempo_estancia
         if(self.desea_desayuno==True):
             num2=self.precio_desayuno*Reservacion.numero_huestes
             num2=num2*Reservacion.tiempo_estancia
         if(self.desea_cena==True):
             num3=self.precio_cena*Reservacion.numero_huestes
             num3=num3*Reservacion.tiempo_estancia
             totalComida=num1+num2+num3
         return totalComida

class Reservacion(models.Model):
    numero_dias=models.PositiveIntegerField()
    precio_Servicio=models.FloatField()
    numero_huestes=models.PositiveIntegerField()
    tiempo_estancia=models.PositiveIntegerField()
    tipo_descuento=models.CharField(max_length=50)
    numero_reservacion=models.PositiveIntegerField(primary_key="reservacion-id")
    reservacion_comida_list = models.ManyToManyField(ReservacionComida, blank=True, related_name='reservacionComida_list')
    precio_reservacion = models.FloatField(blank=True)

    def CalcularPrecioReservacionHabitacion(self,Habitacion):
        precio_habitacion=  Habitacion.precio_habitacion+ Habitacion.precio_banio
        aux_precio = (precio_habitacion *( self.numero_huestes * self.tiempo_estancia))
        aux_descuento = Habitacion.precio_habitacion * self.tipo_descuento
        self.precio_reservacion = aux_precio - aux_descuento
        return self.precio_reservacion

    def CostoServicio(self,Servicio,ServicioAdicional):
        precio_Servicio= ((Servicio.precio_internet + ServicioAdicional.precioAddServicio()) * self.tiempo_estancia)
        return precio_Servicio

    def CostoComida(self,ReservacionComida):
        precio_reservacion_comida= ReservacionComida.precioComidaPorHuesped
        return precio_reservacion_comida


class Factura(models.Model):
    numero_factura=models.PositiveIntegerField(primary_key="factura-id")
    fecha=models.CharField(max_length=50)
    ruc=models.CharField(max_length=30)
    valor_subtotal=models.FloatField(blank=True,null = True)
    valor_total=models.FloatField(blank=True,null = True)
    valor_iva=models.FloatField(blank=True,null = True)
    habitacion_lista=models.ManyToManyField(Habitacion, blank=True,related_name= 'habitacion_lista')

    def __str__(self):
        return 'Factura'

    def CalcularSubtotalHabitacion(self,Habitacion):
        self.valor_subtotal = Habitacion.precio_habitacion
        return self.valor_subtotal

    def CalcularIva(self):
        self.valor_iva = 0.12
        return self.valor_iva * self.valor_subtotal

    def CalcularTotal(self):
        return  self.valor_subtotal+self.valor_iva



class Hotel(models.Model):
    nombre = models.CharField(max_length=50)
    numero_habitaciones=models.PositiveIntegerField(null = False,blank=False,help_text="Ingrese el numero de habitaciones del Hotel")
    numero_pisos= models.PositiveIntegerField(null = False,blank=False,help_text="Ingrese el numero de pisos del Hotel")
    posee_piscina=models.BooleanField(help_text="Desea reservar con piscina")
    ruc = models.CharField(max_length=50,primary_key="ruc-id")
    numero_estrellas=models.PositiveSmallIntegerField()
    ubicacion=models.CharField(max_length=100)
    fecha_inaguracion=models.CharField(max_length=50)
    habitacion_list=models.ManyToManyField(Habitacion, blank=True,related_name= 'habitacion_list')
    def __str__(self):
        return self.nombre

    def listar_hoteles(self):
        return Hotel.objects.all()


class ServicioAdicional(models.Model):
    tvcable=models.BooleanField()
    servicio_habitacion=models.BooleanField()
    servicio_limpieza=models.BooleanField()
    bar=models.BooleanField()
    spa=models.BooleanField()
    gim=models.BooleanField()
    precio_bar=models.FloatField()
    precio_spa=models.FloatField()
    precio_gim=models.FloatField()
    precio_servicio_limpieza=models.FloatField()
    precio_tvcalbe=models.FloatField()
    precio_servicio_habitacion=models.FloatField()

    def __str__(self):
        return "Servicio Adicional #"+self.id


    def precioAddServicio(self,Reservacion):

            if(self.tvcable == True) :
                self.precio_tvcalbe=Reservacion.tiempo_estancia * self.precio_tvcalbe
                if (self.servicio_habitacion == True):
                    self.precio_servicio_habitacion=Reservacion.tiempo_estancia * self.precio_servicio_habitacion
                    if (self.servicio_limpieza == True):
                        self.precio_servicio_limpieza=Reservacion.tiempo_estancia * self.precio_servicio_limpieza
                        if (self.gim == True):
                            self.precio_gim=Reservacion.tiempo_estancia * self.precio_gim
                            if (self.bar == True):
                                self.precio_bar=Reservacion.tiempo_estancia * self.precio_bar
                                if (self.spa == True):
                                        self.precio_spa=Reservacion.tiempo_estancia * self.precio_spa
                                        precio_total= self.precio_servicio_habitacion+self.precio_servicio_limpieza+self.precio_tvcalbe+ self.precio_gim+self.precio_bar+self.precio_spa
                                        return precio_total

class Servicio(models.Model):
    precio_internet=models.FloatField()
    numero_servicio=models.PositiveIntegerField(primary_key="servicio-id")
    servicio_adicional=models.ManyToManyField(ServicioAdicional,blank=True,related_name="servicioa_list")


class Persona(models.Model):
    nombre=models.CharField(max_length=50)
    apellido=models.CharField(max_length=50)
    identificacion=models.CharField(max_length=50)

    def __str__(self):
        return self.nombre


class Cliente(Persona):
    cliente_id=models.CharField(max_length=50,primary_key="cliente-id")



class Gerente(Persona):
    gerente_id=models.PositiveIntegerField()


class Recepcionista(models.Model):
    recepcionista_id=models.PositiveIntegerField(primary_key="recepcionista-id")
    recepcionista=models.PositiveIntegerField()
    reservacion= models.ManyToManyField(Reservacion,blank=True,related_name="reservacion_list")


class Recepcion(models.Model):
    numero_habitacion_disponibles=models.BooleanField
    recepcion_id=models.PositiveIntegerField(primary_key="recepcion-id")


class RealizarEvento(models.Model):
    evento_id=models.PositiveIntegerField(primary_key="envento-id")
    fecha=models.CharField(max_length=40)
    duracion=models.CharField(max_length=70)
    tipo_evento=models.CharField(max_length=50)

class Bar(models.Model):
    precio_bar=models.FloatField()
    bar_id=models.PositiveIntegerField(primary_key="bar-id")
    numero_bebidas_alcoholicas=models.PositiveIntegerField()
    numero_bebidas_no_alcoholicas = models.PositiveIntegerField()



