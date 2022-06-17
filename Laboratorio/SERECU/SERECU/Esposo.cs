using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SERECU
{
    public class Esposo
    {
        public string carnet;
        public string nombre;
        public string primerApellido;
        public string segundoApellido;

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }

        public string PrimerApellido
        {
            get { return primerApellido; }
            set { primerApellido = value; }
        }

        public string SegundoApellido
        {
            get { return segundoApellido; }
            set { segundoApellido = value; }
        }

        public string Carnet
        {
            get { return carnet; }
            set { carnet = value; }
        }
    }
}