<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cuenta extends Model
{
    use HasFactory;
    protected $table = 'cuentas';
    protected $fillable = ['ncuenta', 'saldo', 'cliente_id'];
}
