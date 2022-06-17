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
            persona.fechaNacimiento = "15/03/89";
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

            persona.carnet = "78553499";
            persona.nombre = "Cristian";
            persona.primerApellido = "Aguilar";
            persona.segundoApellido = "Pinto";
            persona.fechaNacimiento = "15/03/96";
            persona.datosPadre = "Mauricio Aguilar Flores";
            persona.datosMadre= "Maria Pinto Villanueva";

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
        public Persona ObtenerCertificadoMatrimonio(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.carnet = "78553499";
            persona.nombre = "Cristian";
            persona.primerApellido = "Aguilar";
            persona.segundoApellido = "Pinto";
            persona.esposo.carnet = "98437313";
            persona.esposo.nombre = "Mariana";
            persona.esposo.primerApellido = "Lopez";
            persona.esposo.segundoApellido = "Choque";

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
        public Persona ObtenerCeritificadoDefunsion(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.carnet = "78553499";
            persona.nombre = "Cristian";
            persona.primerApellido= "Aguilar";
            persona.segundoApellido = "Pinto";
            persona.fechaNacimiento = "15/03/2020";
            persona.causa = "Intoxicacion";

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
    }
}
