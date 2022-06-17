using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace SERECU
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

        [WebMethod]
        public Persona ObtenerDatos(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.carnet = "78553499";
            persona.nombre = "Cristian";
            persona.primerApellido = "Aguilar";
            persona.segundoApellido = "Pinto";
            persona.fechaDefuncion = "15/03/89";
            persona.sexo = "M";
            persona.estadoCivil = "Casado";

            error.nombre = "Error";
            if (ci == persona.carnet)
            {
                return persona;
            }
            else
            {
                return error;
            }
        }

        [WebMethod]
        public Persona ObtenerCertificadoNacimiento(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.Carnet = "78553499";
            persona.Nombre = "Cristian";
            persona.PrimerApellido = "Aguilar";
            persona.SegundoApellido = "Pinto";
            persona.FechaNacimiento = "15/03/96";
            persona.DatosPadre = "Mauricio Aguilar Flores";
            persona.DatosMadre = "Maria Pinto Villanueva";

            error.Nombre = "Error";
            if (ci == persona.Carnet)
            {
                return persona;
            }
            else
            {
                return error;
            }

        }

        [WebMethod]
        public Persona ObtenerCertificadoMatrimonio(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.Carnet = "78553499";
            persona.Nombre = "Cristian";
            persona.PrimerApellido = "Aguilar";
            persona.SegundoApellido = "Pinto";
            persona.esposo.Carnet = "98437313";
            persona.esposo.Nombre = "Mariana";
            persona.esposo.PrimerApellido = "Lopez";
            persona.esposo.SegundoApellido = "Choque";

            error.Nombre = "Error";
            if (ci == persona.Carnet)
            {
                return persona;
            }
            else
            {
                return error;
            }
        }

        [WebMethod]
        public Persona ObtenerCeritificadoDefunsion(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.Carnet = "78553499";
            persona.Nombre = "Cristian";
            persona.PrimerApellido = "Aguilar";
            persona.SegundoApellido = "Pinto";
            persona.FechaDefuncion = "15/03/2020";
            persona.Causa = "Intoxicacion";

            error.Nombre = "Error";
            if (ci == persona.Carnet)
            {
                return persona;
            }
            else
            {
                return error;
            }

        }
    }
}
