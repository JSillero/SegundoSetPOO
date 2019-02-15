'''
Created on 12 feb. 2019

@author: d18sisaj
'''
from Terminal import Terminal

class Movil(Terminal):
    def __init__(self,numero,tarifa):
        super(Movil,self).__init__(self,numero)
        __tar=tarifa
        __saldo=0
    def str(self):
        return("Nº ",self.numero," - ",self.tiempo," s de conversación.")
        