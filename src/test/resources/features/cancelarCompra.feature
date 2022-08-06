#language: es
  Característica:  Cancelar la compra

    Antecedentes:
      Dado que el usuariose encuentre en la pagina Deskosa
      Cuando el ingrese el usuario y contrasena
      Dado  que el usuario se encuentre en la sub categoria planta decorativa
      Cuando agrege un producto al carro de compra

    Escenario: cancelar compra exitosamente
      Dado agrega tres productos al carro de compra
      Cuando pase por caja llenara los datos
      Entonces cancelara la compra.
