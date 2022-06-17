using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsumoAPi
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            string carnet = txtCi.Text.ToString();
            //SOperaciones.OperacionesSoapClient cl = new SOperaciones.OperacionesSoapClient();
            SERECU.WebService1SoapClient cl = new SERECU.WebService1SoapClient();
            txtCi.Text = "";
            txtCi.Focus();

            //cl.ObtenerDatos(carnet);

            lstViewDatos.Items.Add(cl.ObtenerDatos(carnet));
        }
    }
}
