from django import forms

from hotel.models import Reservacion, ReservacionComida, ServicioAdicional


class ReservacionForm(forms.ModelForm):
    class Meta :
        model= Reservacion
        fields=['numero_dias', 'numero_huestes', 'tiempo_estancia', 'reservacion_comida_list']




class ReservacionComidaForm(forms.ModelForm):
    class Meta :
        model= ReservacionComida
        fields=['desea_cena', 'desea_desayuno', 'desea_almuerzo',]


class ServicioAdicionalForm(forms.ModelForm):
    class Meta:
        model = ServicioAdicional
        fields=['tvcable','servicio_habitacion','servicio_limpieza','bar','spa','gim',]
