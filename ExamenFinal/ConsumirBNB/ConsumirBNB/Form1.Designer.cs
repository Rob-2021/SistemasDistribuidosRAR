
namespace ConsumirBNB
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.lstViewDatos = new System.Windows.Forms.ListView();
            this.btnObtenerDatos = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.txtNroCuenta = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // lstViewDatos
            // 
            this.lstViewDatos.HideSelection = false;
            this.lstViewDatos.Location = new System.Drawing.Point(87, 170);
            this.lstViewDatos.Name = "lstViewDatos";
            this.lstViewDatos.Size = new System.Drawing.Size(366, 97);
            this.lstViewDatos.TabIndex = 23;
            this.lstViewDatos.UseCompatibleStateImageBehavior = false;
            // 
            // btnObtenerDatos
            // 
            this.btnObtenerDatos.Location = new System.Drawing.Point(216, 96);
            this.btnObtenerDatos.Name = "btnObtenerDatos";
            this.btnObtenerDatos.Size = new System.Drawing.Size(107, 34);
            this.btnObtenerDatos.TabIndex = 22;
            this.btnObtenerDatos.Text = "Obtener Datos";
            this.btnObtenerDatos.UseVisualStyleBackColor = true;
            this.btnObtenerDatos.Click += new System.EventHandler(this.btnObtenerDatos_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(197, 44);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(20, 13);
            this.label3.TabIndex = 21;
            this.label3.Text = "CI:";
            // 
            // txtNroCuenta
            // 
            this.txtNroCuenta.Location = new System.Drawing.Point(223, 41);
            this.txtNroCuenta.Name = "txtNroCuenta";
            this.txtNroCuenta.Size = new System.Drawing.Size(100, 20);
            this.txtNroCuenta.TabIndex = 20;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(542, 315);
            this.Controls.Add(this.lstViewDatos);
            this.Controls.Add(this.btnObtenerDatos);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtNroCuenta);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.ListView lstViewDatos;
        private System.Windows.Forms.Button btnObtenerDatos;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtNroCuenta;
    }
}

