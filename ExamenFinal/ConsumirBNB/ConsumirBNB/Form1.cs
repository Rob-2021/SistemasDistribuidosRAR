using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsumirBNB
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnObtenerDatos_Click(object sender, EventArgs e)
        {
            BNB.WebService1SoapClient sw = new BNB.WebService1SoapClient();
            BNB.Cliente c = sw.ConsultaSaldo(txtNroCuenta.Text);
            string nrcuenta = txtNroCuenta.ToString();
            txtNroCuenta.Text = "";
            txtNroCuenta.Focus();

            if(c != null)
            {
                lstViewDatos.Items.Add(c.saldo);
            }
        }
    }
}
