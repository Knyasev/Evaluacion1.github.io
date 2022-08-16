from django.urls import path

from hotel import views

urlpatterns = [
    path('',views.index_hotel,  name ='index-hotel'),
    path('hotel',views.hotel,name='hotel'),
    path('hotel/<int:hotel_id>',views.detalles_hotel_y_habitacion, name='hotel-id'),
    path('hotel/habitacion/<int:habitacion_id>',views.habitacion_detalle,name='habitacion-id'),
    path('hotel/habitacion/factura/<int:factura_id>',views.factura_detalle,name='factura-id'),
    path('reservacion/',views.reservacion, name= 'reservacion-id'),
    path('reservacion/<int:reservacion_id>',views.reservacion_detalle,name='reservacion-id'),
    path('reservacion/reservar/<int:reservacion_id>',views.reservar, name= 'reservacion-reservar'),
    path('servicio/',views.servicio, name= 'servicio-id'),
    path('servicio/<int:servicio_id>',views.servicio_detalle, name= 'servicio-id'),
    path('servicio/reservar/<int:servicioAdicional_id>',views.reservarServicioAdicional, name= 'servicio-reservar'),
]
