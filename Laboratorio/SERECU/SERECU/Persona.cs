using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SERECU
{
    public class Persona
    {
        public string nombre;
        public string primerApellido;
        public string segundoApellido;
        public string fechaNacimiento;
        public string sexo;
        public string estadoCivil;
        public string carnet;
        public string datosPadre;
        public string datosMadre;
        public string fechaDefuncion;
        public string causa;
        public Esposo esposo = new Esposo();

    }
}