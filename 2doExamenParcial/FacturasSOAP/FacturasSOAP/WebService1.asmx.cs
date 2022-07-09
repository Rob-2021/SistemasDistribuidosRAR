using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace FacturasSOAP
{
    /// <summary>
    /// Descripción breve de WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {
        /*
        [WebMethod]
        public string HelloWorld()
        {
            return "Hola a todos";
        }*/

        [WebMethod]
        public double obtenerCotizacion(string tipo, double moneda)
        {
            double dolares = 6.96;
            double euros = 8.5;
            double resultado;

            if(tipo == "euro")
            {
                resultado = moneda / euros;
                return resultado;
            }
            else
            {
                resultado = moneda / dolares;
                return resultado;
            }
        }

        [WebMethod]
        public string sincronizarFecha()
        {
            DateTime date = DateTime.Now;
            return date.ToString();
        }

        [WebMethod]
        public string ObtenerCufd()
        {
            return "AB0000345C34521";
        }

        [WebMethod]
        public Factura emitirFactura(string nit)
        {
            Factura factura1 = new Factura();
            Factura error = new Factura();

            factura1.nit = "1010";
            factura1.razonSocial = "Correcto";
            factura1.fecha = sincronizarFecha();
            factura1.numeroFactura = "123456789";
            factura1.cuf = ObtenerCufd();
            factura1.cliente.nit = "2003";
            factura1.cliente.ci = "102327474";
            factura1.cliente.nombre = "Pedro";
            factura1.detalle.cantidad = "3";
            factura1.detalle.producto = "Detergente";
            factura1.detalle.precioUnitario = "10.5";
            factura1.detalle.precioTotal = "31.5";

            error.razonSocial = "error";
            if(nit == factura1.nit)
            {
                return factura1;
            }
            else
            {
                return error;
            }
        }
    }
}
