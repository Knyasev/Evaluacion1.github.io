from django.shortcuts import render, get_object_or_404

# Create your views here.
import hotel
from hotel.forms import ReservacionForm, ReservacionComidaForm, ServicioAdicionalForm
from hotel.models import Hotel, Habitacion, Factura, Reservacion, Servicio, ReservacionComida, ServicioAdicional, Banio


def index(request):
    return render(request,'hotel/index.html',{})

def index_hotel(request):
    return render(request, 'hotel/index-hotel.html',{})

def hotel(request):
    hoteles =Hotel().listar_hoteles()
    context={
        'hoteles': hoteles
    }
    return render(request, 'hotel/hotel.html',context)

def detalles_hotel_y_habitacion(request,hotel_id):
    hotel= get_object_or_404(Hotel,pk=hotel_id)
    habitacion= Habitacion.objects.all
    factura = Factura.objects.all
    context={
        'hotel':hotel,
        'factura':factura,
        'habitacion':habitacion
    }
    return render (request,'hotel/detalles_hotel_y_habitacion.html',context)

def factura_detalle(request,factura_id):
    return render(request,'hotel/factura.html',{'factura':get_object_or_404(Factura,pk=factura_id),'habitacion': Habitacion.objects.all,'servicio': Servicio.objects.all,'reservacion':Reservacion.objects.all })

def habitacion_detalle(request,habitacion_id):
    return render(request,'hotel/preciohabitacion.html',{'habitacion':get_object_or_404(Habitacion,pk=habitacion_id)})


def reservacion(request):
    return render(request,'hotel/reservacion.html ',{'reservacion': Reservacion.objects.all,'servicio': Servicio.objects.all ,'habitacion': Habitacion.objects.all })

def reservacion_detalle(request,reservacion_id):
    return render(request, 'hotel/reservacion_detalle.html', {'reservacion': get_object_or_404(Reservacion,pk=reservacion_id)})

def reservar(request,reservacion_id):
    reservacion = get_object_or_404(Reservacion, pk=reservacion_id)
    form = ReservacionForm(instance=reservacion)
    if request.method == 'POST':
        form = ReservacionForm(request.POST, instance=reservacion)
        if form.is_valid():
            reservacion = form.save(commit=True)
            reservacion.save()
    return render(request,'hotel/reservacion_editar.html  ', {'reservacion': reservacion, 'form': form})

def reservarComida(request,reservacion_id):
    reservacion = get_object_or_404(ReservacionComida, pk=reservacion_id)
    form = ReservacionComidaForm(instance=reservacion)
    if request.method == 'POST':
        form = ReservacionComidaForm(request.POST, instance=reservacion)
        if form.is_valid():
            reservacionComida = form.save(commit=True)
            reservacionComida.save()
    return render(request, 'hotel/reservacion_editar.html', {'reservacionComida': reservacion, 'form': form})

def reservarServicioAdicional(request,servicioAdicional_id):
    servicioAdicional = get_object_or_404(ServicioAdicional, pk=servicioAdicional_id)
    form =  ServicioAdicionalForm(instance=servicioAdicional)
    if request.method == 'POST':
        form =  ServicioAdicionalForm(request.POST, instance=servicioAdicional)
        if form.is_valid():
            servicioAdicional = form.save(commit=True)
            servicioAdicional.save()
    return render(request, 'hotel/servicio_editar.html', {'servicioAdicional': servicioAdicional, 'form': form})


def servicio(request):
    return render(request,'hotel/servicio.html',{'servicio': Servicio.objects.all })

def servicio_detalle(request,servicio_id):
    return render(request, 'hotel/servicio_detalle.html', {'servicio': get_object_or_404(Servicio,pk=servicio_id)})