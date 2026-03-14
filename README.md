# 🎓 UTS Pemrograman Seluler - Aplikasi Generator Lembar Penilaian

## 👨‍🎓 Identitas Mahasiswa
- **Nama Lengkap:** Renald Kevin Azzaky
- **NIM:** 42430029
- **Program Studi:** Teknologi Informasi
- **Universitas:** Universitas Pendidikan Nasional (Undiknas) Bali

---

## 📱 Deskripsi & Pemenuhan Modul Praktikum
Aplikasi ini dibangun khusus untuk memenuhi Ujian Tengah Semester (UTS) mata kuliah Pemrograman Seluler. Aplikasi ini berfungsi sebagai portal dosen untuk mengevaluasi nilai kelas dan mencetak lembar absen. 

Secara teknis, *source code* aplikasi ini mendemonstrasikan penguasaan materi paruh pertama semester, meliputi:

1. **Modul 2 & 3: Desain UI/UX & Responsive Layout** 🎨
   - Implementasi antarmuka modern (Material Design) dengan kombinasi warna *Teal*.
   - Penerapan layout yang beradaptasi secara dinamis saat mode *Portrait* dan *Landscape* (menggunakan folder `layout-land` untuk mendesain *Split-Screen* khusus).
2. **Modul 4: Navigasi & Data Passing (Intent)** 🔄
   - Menggunakan `Intent` untuk perpindahan antar Activity.
   - Mengirim data teks (Nama Dosen) dari Halaman Login ke Halaman Panel secara dinamis menggunakan `putExtra` dan `getStringExtra`.
3. **Modul 5: Control Flow & Algoritma** ⚙️
   - **Percabangan (`If-Else`):** Digunakan untuk mengkalkulasi bobot persentase nilai sekaligus menentukan **Status Kelas** (A/Sangat Baik, B/Baik, C/Cukup, D/Kurang).
   - **Perulangan (`For Loop`):** Digunakan untuk men-*generate* secara otomatis format daftar absen kosong sejumlah mahasiswa yang diinputkan.

---

## ✨ Fitur Utama Aplikasi
- **Sistem Login Dinamis:** Menangkap nama dosen yang diinputkan dan menampilkannya sebagai sapaan personal di halaman utama.
- **Kalkulator Nilai Otomatis:** Menghitung rata-rata nilai akhir secara akurat menggunakan sistem bobot:
   - Kehadiran (10%) | Keaktifan (10%) | Tugas Kelompok (10%) | Tugas Individu (10%) | UTS (30%) | UAS (30%)
- **Penentu Status Kelas:** Otomatis memberikan predikat evaluasi berdasarkan kalkulasi nilai akhir.
- **Generator Daftar Hadir:** Mencetak baris absensi ("Mahasiswa 1: ____", dst) secara otomatis sesuai jumlah mahasiswa di kelas.
- **Desain Responsif:** Tata letak otomatis membelah layar menjadi dua bagian (*Split-Screen*) ketika HP diputar ke mode Landscape agar *keyboard* tidak menutupi layar.

---

## 📸 Screenshot Aplikasi

### 1. Halaman Login (Responsif)
| Mode Portrait | Mode Landscape |
| :---: | :---: |
|<img width="200" height="500" alt="Screenshot_20260314_005336" src="https://github.com/user-attachments/assets/051417cc-3c40-40e2-aa2e-b5d9f7bbaf0a" /> |<img width="500" height="200" alt="Screenshot_20260314_005349" src="https://github.com/user-attachments/assets/aaaf63d4-2c51-41a5-a871-cbb92463a5ba" /> |

### 2. Halaman Panel Generator
| Input Data | Hasil Generate (If-Else & Loop) |
| :---: | :---: |
| <img width="200" height="500" alt="Screenshot_20260314_005454" src="https://github.com/user-attachments/assets/a65da762-66a6-4b61-85d3-1c9a1214624b" /> | <img width="200" height="500" alt="Screenshot_20260314_005522" src="https://github.com/user-attachments/assets/e7743575-b1b9-4f0f-8841-5d0a5e30e7e9" />|

---

## 🛠️ Teknologi & Tools
- **Bahasa Pemrograman:** Kotlin
- **UI/UX Design:** XML dengan komponen Material Design (`CardView`, `TextInputLayout`, `MaterialButton`)
- **IDE:** Android Studio
- **Version Control:** Git & GitHub

---

## 🚀 Cara Menjalankan Project (Build & Run)
Bagi evaluator (Dosen) yang ingin menjalankan aplikasi ini di Android Studio lokal:
1. *Clone* repositori ini menggunakan Git:
   ```bash
   git clone [https://github.com/kevinazzaky/UTS_PemrogamanSeluler_42430029_kevinazzaky.git](https://github.com/kevinazzaky/UTS_PemrogamanSeluler_42430029_kevinazzaky.git)
