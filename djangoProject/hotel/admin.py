from django.contrib import admin

from hotel.models import Habitacion, Banio, Hotel, Reservacion, ReservacionComida, RealizarEvento, ServicioAdicional, \
    Servicio, Cliente, Gerente, Bar, Factura, Recepcion, Recepcionista

admin.site.register(Hotel)
admin.site.register(Habitacion)
admin.site.register(Banio)
admin.site.register(Reservacion)
admin.site.register(ReservacionComida)
admin.site.register(Bar)
admin.site.register(Gerente)
admin.site.register(Cliente)
admin.site.register(Servicio)
admin.site.register(ServicioAdicional)
admin.site.register(RealizarEvento)
admin.site.register(Factura)
admin.site.register(Recepcion)
admin.site.register(Recepcionista)
