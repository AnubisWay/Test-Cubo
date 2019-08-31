# Test-Cubo
Proyecto realizado con el objetivo de obtener una matriz N x N que gire en sentido anti-horario.
La funcionabilidad se encuentra expuesta mediante el API construido con una operación del tipo @POST.
Asimismo, el servicio puede ser consultado mediante la siguiente URI: https://servicecubo.herokuapp.com/cubo

Ejemplo del request:
{
	"matriz":[[1,2],[3,4]]
}

Ejemplo del response:
{
  "matrizOrdenada":[[2,4],[1,3]]
}
