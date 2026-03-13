package com.example.uts_pemrogamanseluler_42430029_kevinazzaky.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_pemrogamanseluler_42430029_kevinazzaky.databinding.ActivityLoginBinding
import com.example.uts_pemrogamanseluler_42430029_kevinazzaky.ui.generator.GeneratorActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMasuk.setOnClickListener {
            val namaDosen = binding.etNamaDosen.text.toString()

            if (namaDosen.isNotEmpty()) {
                val intent = Intent(this, GeneratorActivity::class.java)
                intent.putExtra("NAMA_DOSEN", namaDosen)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Nama Dosen tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}