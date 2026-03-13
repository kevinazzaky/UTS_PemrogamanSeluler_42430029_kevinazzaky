package com.example.uts_pemrogamanseluler_42430029_kevinazzaky.ui.generator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_pemrogamanseluler_42430029_kevinazzaky.databinding.ActivityGeneratorBinding

class GeneratorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGeneratorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGeneratorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil data nama
        val namaDosen = intent.getStringExtra("NAMA_DOSEN") ?: "Tanpa Nama"

        // Menampilkan teks sapaan
        binding.tvSapaan.text = "Selamat bertugas, Dosen $namaDosen"

        binding.btnProses.setOnClickListener {
            val inputJmlMhs = binding.etJmlMahasiswa.text.toString()
            val inputKehadiran = binding.etNilaiKehadiran.text.toString()
            val inputKeaktifan = binding.etNilaiKeaktifan.text.toString()
            val inputKelompok = binding.etNilaiKelompok.text.toString()
            val inputTugas = binding.etNilaiTugas.text.toString()
            val inputUts = binding.etNilaiUTS.text.toString()
            val inputUas = binding.etNilaiUAS.text.toString()

            // Cek jika ada 1 saja kotak yang kosong
            if (inputJmlMhs.isEmpty() || inputKehadiran.isEmpty() || inputKeaktifan.isEmpty() ||
                inputKelompok.isEmpty() || inputTugas.isEmpty() || inputUts.isEmpty() || inputUas.isEmpty()) {
                binding.tvHasilOutput.text = "Error: Harap isi semua kolom nilai dengan lengkap!"
                return@setOnClickListener
            }

            val jmlMahasiswa = inputJmlMhs.toInt()
            val nilaiKehadiran = inputKehadiran.toDouble()
            val nilaiKeaktifan = inputKeaktifan.toDouble()
            val nilaiKelompok = inputKelompok.toDouble()
            val nilaiTugas = inputTugas.toDouble()
            val nilaiUts = inputUts.toDouble()
            val nilaiUas = inputUas.toDouble()

            // --- LOGIKA PENGHITUNGAN: Sistem Bobot Persentase (Total 100%) ---
            val skorKehadiran = nilaiKehadiran * 0.10  // 10%
            val skorKeaktifan = nilaiKeaktifan * 0.10  // 10%
            val skorKelompok  = nilaiKelompok  * 0.10  // 10%
            val skorTugas     = nilaiTugas     * 0.10  // 10%
            val skorUts       = nilaiUts       * 0.30  // 30%
            val skorUas       = nilaiUas       * 0.30  // 30%

            // Menjumlahkan semua skor menjadi Nilai Akhir
            val nilaiAkhir = skorKehadiran + skorKeaktifan + skorKelompok + skorTugas + skorUts + skorUas

            // --- LOGIKA 1 (IF-ELSE): Status Kelas ---
            var statusKelas = ""
            if (nilaiAkhir >= 80) {
                statusKelas = "Sangat Baik (A)"
            } else if (nilaiAkhir >= 70) {
                statusKelas = "Baik (B)"
            } else if (nilaiAkhir >= 60) {
                statusKelas = "Cukup (C)"
            } else {
                statusKelas = "Kurang (D/E)"
            }

            // --- LOGIKA 2 (PERULANGAN FOR) ---
            val stringBuilder = java.lang.StringBuilder()
            val nilaiAkhirFormat = String.format("%.2f", nilaiAkhir)

            stringBuilder.append("=== HASIL EVALUASI KELAS ===\n")
            stringBuilder.append("• Nilai Akhir (Berbobot): $nilaiAkhirFormat\n")
            stringBuilder.append("• Status Kelas: $statusKelas\n\n")
            stringBuilder.append("=== DAFTAR ABSEN MAHASISWA ===\n")

            for (i in 1..jmlMahasiswa) {
                stringBuilder.append("Mahasiswa $i: ______\n")
            }

            // Tampilkan hasil akhir
            binding.tvHasilOutput.text = stringBuilder.toString()
        }
    }
}