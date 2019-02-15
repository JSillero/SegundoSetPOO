'''
Created on 8 feb. 2019

@author: d18sisaj
'''

class Vehiculo(object):
    _VehiculosCreados=0
    _KilometrosTotales=0
    def __init__(self, params):
        Vehiculo.VehiculosCreados+=1
        self.Kilometrosrecorridos=0
    def avanza(self, kmetros):
        Vehiculo.KilometrosTotales+=kmetros
        self.Kilometrosrecorridos+=kmetros
    def getter(self):
        return self.Kilometrosrecorridos;
    def getterT(self):
        return Vehiculo.KilometrosTotales;
    