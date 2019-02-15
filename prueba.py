'''
Created on 13 feb. 2019

@author: d18sisaj
'''
class Celsius:
    def __init__(self, temperature = 0):
        self.temperature = temperature
        self.valorprueva=0
    def to_fahrenheit(self):
        return (self.temperature * 1.8) + 32
    @property
    def temperature(self):
        print("Getting value")
        return self._temperature
    @temperature.setter
    def temperature(self, value):
        if value < -273:
            raise ValueError("Temperature below -273 is not possible")
        print("Setting value")
        self._temperature = value
    @temperature.setter2
    def temperature(self, value,x):
        if value < -273:
            raise ValueError("Temperature below -273 is not possible")
        print("Setting value")
        self._temperature = value
        valorprueva=BaseException
        print(valorprueva)
