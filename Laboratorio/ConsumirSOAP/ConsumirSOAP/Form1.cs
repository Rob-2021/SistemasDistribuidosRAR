using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsumirSOAP
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            SERECI.WebService1SoapClient sw = new SERECI.WebService1SoapClient();
            SERECI.Persona p = sw.ObtenerDatos(txtCi.Text);
            string carnet = txtCi.Text.ToString();
            txtCi.Text = "";
            txtCi.Focus();

            if (p != null)
            {
                lstViewDatos.Items.Add(p.carnet);
                lstViewDatos.Items.Add(p.nombre);
                lstViewDatos.Items.Add(p.primerApellido);
                lstViewDatos.Items.Add(p.segundoApellido);
                lstViewDatos.Items.Add(p.fechaNacimiento);
                lstViewDatos.Items.Add(p.sexo);
                lstViewDatos.Items.Add(p.estadoCivil);
            }


        }

        private void btnCertificadoNacimiento_Click(object sender, EventArgs e)
        {
            SERECI.WebService1SoapClient sw = new SERECI.WebService1SoapClient();
            SERECI.Persona p = sw.ObtenerCertificadoNacimiento(txtCi.Text);
            string carnet = txtCi.Text.ToString();
            txtCi.Text = "";
            txtCi.Focus();

            if (p != null)
            {
                lstViewDatos.Items.Add(p.carnet);
                lstViewDatos.Items.Add(p.nombre);
                lstViewDatos.Items.Add(p.primerApellido);
                lstViewDatos.Items.Add(p.segundoApellido);
                lstViewDatos.Items.Add(p.fechaNacimiento);
                lstViewDatos.Items.Add(p.datosPadre);
                lstViewDatos.Items.Add(p.datosMadre);
            }

        }

        private void btnCertificadoMatrimonio_Click(object sender, EventArgs e)
        {
            SERECI.WebService1SoapClient sw = new SERECI.WebService1SoapClient();
            SERECI.Persona p = sw.ObtenerCertificadoMatrimonio(txtCi.Text);
            string carnet = txtCi.Text.ToString();
            txtCi.Text = "";
            txtCi.Focus();

            if (p != null)
            {
                lstViewDatos.Items.Add(p.carnet);
                lstViewDatos.Items.Add(p.nombre);
                lstViewDatos.Items.Add(p.primerApellido);
                lstViewDatos.Items.Add(p.segundoApellido);
                lstViewDatos.Items.Add(p.esposo.carnet);
                lstViewDatos.Items.Add(p.esposo.nombre);
                lstViewDatos.Items.Add(p.esposo.primerApellido);
                lstViewDatos.Items.Add(p.esposo.segundoApellido);
            }

        }

        private void btnCertificadoDefuncion_Click(object sender, EventArgs e)
        {
            SERECI.WebService1SoapClient sw = new SERECI.WebService1SoapClient();
            SERECI.Persona p = sw.ObtenerCeritificadoDefunsion(txtCi.Text);
            string carnet = txtCi.Text.ToString();
            txtCi.Text = "";
            txtCi.Focus();

            if (p != null)
            {
                lstViewDatos.Items.Add(p.carnet);
                lstViewDatos.Items.Add(p.nombre);
                lstViewDatos.Items.Add(p.primerApellido);
                lstViewDatos.Items.Add(p.segundoApellido);
                lstViewDatos.Items.Add(p.fechaNacimiento);
                lstViewDatos.Items.Add(p.causa);
            }
        }
    }
    
}
