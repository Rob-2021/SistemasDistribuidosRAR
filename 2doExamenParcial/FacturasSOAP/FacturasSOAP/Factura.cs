using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace FacturasSOAP
{
    public class Factura
    {
        public string nit;
        public string razonSocial;
        public string fecha;
        public string numeroFactura;
        public string cuf;
        //public string tipoDocumento;
        //public string nombreCliente;
        public Detalle detalle = new Detalle();
        public DocumentoCliente cliente = new DocumentoCliente();
    }
}