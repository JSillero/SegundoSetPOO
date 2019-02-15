'''
Created on 12 feb. 2019

@author: d18sisaj
'''

class Terminal:
    def __init__(self,n):
        self.__numero=n;
        self.__tiempo=0;
        
    def str(self):
        return("Nº ",self.numero," - ",self.tiempo," s de conversación.")
    def llamada(self, Terminal,t):
        self.tiempo+=t
        Terminal.tiempo+=t