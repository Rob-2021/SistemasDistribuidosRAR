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

        public string FechaNacimiento
        {
            get { return fechaNacimiento; }
            set { fechaNacimiento = value; }
        }

        public string Sexo
        {
            get { return sexo; }
            set { sexo = value; }
        }

        public string EstadoCivil
        {
            get { return estadoCivil; }
            set { estadoCivil = value; }
        }

        public string Carnet
        {
            get { return carnet; }
            set { carnet = value; }
        }

        public Esposo Esposo
        {
            get { return esposo; }
            set { esposo = value; }
        }

        public string FechaDefuncion
        {
            get { return fechaDefuncion; }
            set { fechaDefuncion = value; }
        }

        public string Causa
        {
            get { return causa; }
            set { causa = value; }
        }

        public string DatosPadre
        {
            get { return datosPadre; }
            set { datosPadre = value; }
        }

        public string DatosMadre
        {
            get { return datosMadre; }
            set { datosMadre = value; }
        }
    }
}