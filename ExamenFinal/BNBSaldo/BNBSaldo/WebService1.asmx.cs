using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace BNBSaldo
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

        //[WebMethod]
        //public string HelloWorld()
        //{
        //    return "Hola a todos";
        //}

        [WebMethod]
        public Cliente ConsultaSaldo(string nrocuenta)
        {
            Cliente cliente = new Cliente();
            Cliente error = new Cliente();

            cliente.nrocuenta = "111-1";
            cliente.saldo = "20000.33";

            error.saldo = "Error";
            if (nrocuenta == cliente.nrocuenta)
            {
                return cliente;
            }
            else
            {
                return error;
            }
        }
    }
}
