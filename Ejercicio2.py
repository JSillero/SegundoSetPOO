'''
Created on 12 feb. 2019

@author: d18sisaj
'''
from Bicicleta import Bicicleta
from Coche import Coche
km=0 #variable para la funcion avanzar
respuesta=0 #variable para menu
coche=Coche()
bicicleta=Bicicleta()

while respuesta!=8:
    print("VEHICULOS \n=============== \n 1.Anda con la bicicleta \n 2.Haz el caballito con la bicicleta \n 3.Anda con el coche \n 4.Quema rueda con el coche \n 5.Ver el kilometraje de la bicicleta \n 6.Ver el kilometraje del coche \n 7.Ver el kilometraje total \n 8.Salir")
    respuesta=int(input())
    
    if respuesta==1:
        print("¿Cuantos kilometros andamos?")
        km=int(input())
        bicicleta.avanza(km)
   
    if respuesta==2:
        bicicleta.Caballito()
    
    if respuesta==3:
        km=int(input("¿Cuantos kilometros andamos?"))
        coche.avanza(km)    
   
    if respuesta==4:
        coche.QuemarRueda()
    
    if respuesta==5:
        print("La bicicleta ha recorrido",bicicleta.getter()," kilometros.")
    
    if respuesta==6:
        print("El coche ha recorrido",coche.getter()," kilometros.")
   
    if respuesta==7:
        print("La distancia total recorrida es de: ",bicicleta.getterT()," kilometros.")
    
    