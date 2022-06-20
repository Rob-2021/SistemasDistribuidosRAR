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


            txtCi.Text = "";
            txtCi.Focus();

            //cl.ObtenerDatos(carnet);

            //lstViewDatos.Items.Add(cl.ObtenerDatos(carnet));
        }
    }
    
}
