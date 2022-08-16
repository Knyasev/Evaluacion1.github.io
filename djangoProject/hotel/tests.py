from django.test import TestCase

from hotel.models import Hotel, Reservacion, Habitacion, ReservacionComida, Factura, Servicio, ServicioAdicional

'''from unittest import TestCase
'''
class TestHoteles(TestCase):

    def setUp(self):
        self.hotel =Hotel.objects.create(
            nombre="Camerum",
            ubicacion="Loja",
            ruc="12511",
            fecha_inaguracion="12-05-2012",
            numero_pisos=4,
            numero_habitaciones=10,
            numero_estrellas=5,
            posee_piscina = True
        )

    def test_hotel(self):
        assert self.hotel.nombre
        assert self.hotel.ubicacion
        assert self.hotel.numero_habitaciones
        assert self.hotel.fecha_inaguracion
        assert self.hotel.numero_estrellas
        assert self.hotel.numero_pisos
        self.assertEqual(self.hotel.posee_piscina,True)
        assert self.hotel.ruc

class TestFactura(TestCase):
    def setUp(self):
        self.habitacion= Habitacion.objects.model(precio_habitacion=16)
        self.factura = Factura.objects.model(valor_subtotal=325,valor_iva=0.12)

    def test_factura(self):
        assert self.factura.CalcularIva()


    def test_subtotal(self):
        assert self.factura.CalcularSubtotalHabitacion(self.habitacion)

    def test_total(self):
        assert self.factura.CalcularTotal()

class TestReservacion(TestCase):

    def setUp(self):
        self.servicio = Servicio.objects.model(precio_internet=1)
        self.reservacion =  Reservacion.objects.model(tiempo_estancia=4, numero_huestes=3,tipo_descuento=0.5)
        self.reservacion_comida = ReservacionComida.objects.model(desea_cena=True,desea_almuerzo=True,desea_desayuno=True,precio_almuerzo=3.5,precio_desayuno=2,precio_cena=3.0,)
        self.habitacion= Habitacion.objects.model(precio_habitacion=15,precio_banio=1)

    def test_precio_reservacion_habitacion(self):
        assert self.reservacion.CalcularPrecioReservacionHabitacion(self.habitacion)

    def test_costo_servicio(self):
        assert self.reservacion.CostoComida(self.reservacion_comida)

class TestServicioAdicional(TestCase):
    def setUp(self):
        self.reservacion =  Reservacion.objects.model(tiempo_estancia=4, numero_huestes=3,tipo_descuento=0.5)
        self.servicio_adicional = ServicioAdicional.objects.model(servicio_limpieza=True,servicio_habitacion=True,bar=True,spa=True,gim=True,tvcable=True,precio_bar=2,precio_gim=3,precio_spa=4,precio_tvcalbe=2,precio_servicio_limpieza=2,precio_servicio_habitacion=5)

    def test_precio_por_huesped(self):
        assert self.servicio_adicional.precioAddServicio(self.reservacion)