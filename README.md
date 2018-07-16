# Cerradura
+ Implementar la clase cerradura con los siguientes métodos:
  + Cerradura(Integer claveDeApertura , Integer cantidadDeFallosConsecutivosQueLaBloquean) : permite construir una cerradura cerrada.Se recibe informacion necesaria para la creacion
  + abrir(Integer clave) : abre la cerradura si se proporciona la clave correcta
  + cerrar() : cierra la cerradura
  + estaAbierta() : devuelve el valor de verdad segun su estado
  + estaCerrada() : devuelve el valor de verdad segun su estado
  + fueBloqueada() : devuelve valor de verdad segun se supera los tres intentos de apertura con clave incorrecta
  + contarAperturasExitosas() : total de aperturas exitosas
  + contarAperturasFallidas() : total de intentos de aperturas con clave incorrecta
+ Nota : Considerar que cuando una cerradura se bloquea no puede volver a abrirse nunca más
  
