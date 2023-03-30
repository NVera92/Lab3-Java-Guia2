public class Main {
    public static void main(String[] args) {

        /*
        Persona [] autores = new Persona[2];

       autores[0] = new Persona("Juan","Pacifico","juan@google.com",'M');
       autores[1] = new Persona("Diego","Lucero","diego@google.com",'M');


        Libro book = new Libro("Effective Java",450,150,autores);


        book.setPrecio(500);
        book.aumentarStock(50);

        book.mostrarLibro();


        Nos contratan para hacer un programa que lleve el control de las ventas de un
local. Para esto es necesario modelar la clase Cliente, que posee un atributo id
como identificador del cliente, el mismo debe ser un valor compuesto por letras y
números aleatorios que se generan automáticamente al crear un Cliente. El Cliente
también posee un nombre, un email y un porcentaje de descuento.
Por otro lado vamos a tener el objeto Factura que representa una venta del
local, cada Factura posee un identificador de las mismas características que el
usado en Cliente. A su vez cada factura posee un monto total, una fecha y el Cliente
que generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al
momento de creación del objeto Factura. El tipo Factura debe contar con un
método que calcule el monto final luego de aplicarle el descuento que posee el
cliente.
a. Investigue la clase UUID y sus métodos estáticos para la generación de los
ids. Investigue la clase LocalDate y sus métodos estáticos para la generación
de la fecha.
b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
haga uso de un método que facilite la impresión del mismo.
Cliente[id=?, nombre=?, email=?, descuento=?]
c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
monto total luego de aplicarle el descuento.
d. Cree un método que facilite la impresión del objeto de tipo Factura y que
siga el siguiente formato.
Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
email=?, descuento=?]]
e. Analizar de agregar el tipo ItemVenta, que representa un producto que
forma parte de la venta. El mismo contiene un id, un nombre, descripción y
precio unitario. Considere las modificaciones necesarias en el tipo Factura
para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
calcular los montos totales con y sin el descuento aplicado.
         */

    Cliente customer = new Cliente("Facundo","Cuadrado","facundo@google.com",5.8);

        System.out.println(customer.toString());



        //System.out.println(fac.getMount());
        //fac.executeDiscount(customer.getDiscount());
        //System.out.println(fac.getMount());

        //System.out.println(fac.toString());



        Venta [] a = new Venta[3];

        a[0] = new Venta(1,"Gallo","Arroz",150.3);
        a[1] = new Venta(2,"Don Vicente","Fideos",460);

        Factura fac = new Factura()





    }


}