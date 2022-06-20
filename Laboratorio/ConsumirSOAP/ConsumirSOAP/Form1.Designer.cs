namespace ConsumirSOAP
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
            this.txtCi = new System.Windows.Forms.TextBox();
            this.btnCertificadoNacimiento = new System.Windows.Forms.Button();
            this.btnCertificadoMatrimonio = new System.Windows.Forms.Button();
            this.btnCertificadoDefuncion = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lstViewDatos
            // 
            this.lstViewDatos.HideSelection = false;
            this.lstViewDatos.Location = new System.Drawing.Point(61, 163);
            this.lstViewDatos.Name = "lstViewDatos";
            this.lstViewDatos.Size = new System.Drawing.Size(366, 97);
            this.lstViewDatos.TabIndex = 16;
            this.lstViewDatos.UseCompatibleStateImageBehavior = false;
            // 
            // btnObtenerDatos
            // 
            this.btnObtenerDatos.Location = new System.Drawing.Point(23, 80);
            this.btnObtenerDatos.Name = "btnObtenerDatos";
            this.btnObtenerDatos.Size = new System.Drawing.Size(107, 34);
            this.btnObtenerDatos.TabIndex = 15;
            this.btnObtenerDatos.Text = "Obtener Datos";
            this.btnObtenerDatos.UseVisualStyleBackColor = true;
            this.btnObtenerDatos.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(171, 37);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(20, 13);
            this.label3.TabIndex = 14;
            this.label3.Text = "CI:";
            // 
            // txtCi
            // 
            this.txtCi.Location = new System.Drawing.Point(197, 34);
            this.txtCi.Name = "txtCi";
            this.txtCi.Size = new System.Drawing.Size(100, 20);
            this.txtCi.TabIndex = 13;
            // 
            // btnCertificadoNacimiento
            // 
            this.btnCertificadoNacimiento.Location = new System.Drawing.Point(136, 80);
            this.btnCertificadoNacimiento.Name = "btnCertificadoNacimiento";
            this.btnCertificadoNacimiento.Size = new System.Drawing.Size(107, 34);
            this.btnCertificadoNacimiento.TabIndex = 17;
            this.btnCertificadoNacimiento.Text = "CE Nacimiento";
            this.btnCertificadoNacimiento.UseVisualStyleBackColor = true;
            this.btnCertificadoNacimiento.Click += new System.EventHandler(this.btnCertificadoNacimiento_Click);
            // 
            // btnCertificadoMatrimonio
            // 
            this.btnCertificadoMatrimonio.Location = new System.Drawing.Point(249, 80);
            this.btnCertificadoMatrimonio.Name = "btnCertificadoMatrimonio";
            this.btnCertificadoMatrimonio.Size = new System.Drawing.Size(107, 34);
            this.btnCertificadoMatrimonio.TabIndex = 18;
            this.btnCertificadoMatrimonio.Text = "CE Matrimonio";
            this.btnCertificadoMatrimonio.UseVisualStyleBackColor = true;
            this.btnCertificadoMatrimonio.Click += new System.EventHandler(this.btnCertificadoMatrimonio_Click);
            // 
            // btnCertificadoDefuncion
            // 
            this.btnCertificadoDefuncion.Location = new System.Drawing.Point(362, 80);
            this.btnCertificadoDefuncion.Name = "btnCertificadoDefuncion";
            this.btnCertificadoDefuncion.Size = new System.Drawing.Size(107, 34);
            this.btnCertificadoDefuncion.TabIndex = 19;
            this.btnCertificadoDefuncion.Text = "CE Defuncion";
            this.btnCertificadoDefuncion.UseVisualStyleBackColor = true;
            this.btnCertificadoDefuncion.Click += new System.EventHandler(this.btnCertificadoDefuncion_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(510, 377);
            this.Controls.Add(this.btnCertificadoDefuncion);
            this.Controls.Add(this.btnCertificadoMatrimonio);
            this.Controls.Add(this.btnCertificadoNacimiento);
            this.Controls.Add(this.lstViewDatos);
            this.Controls.Add(this.btnObtenerDatos);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtCi);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lstViewDatos;
        private System.Windows.Forms.Button btnObtenerDatos;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtCi;
        private System.Windows.Forms.Button btnCertificadoNacimiento;
        private System.Windows.Forms.Button btnCertificadoMatrimonio;
        private System.Windows.Forms.Button btnCertificadoDefuncion;
    }
}

