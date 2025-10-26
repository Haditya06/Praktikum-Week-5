# Praktikum-Week-5

# 📘 Algoritma Pemrograman

## Bab VI – Perulangan

dari mata kuliah **Algoritma dan Pemrograman Komputer** di **Program Studi Rekayasa Perangkat Lunak, Universitas Telkom Surabaya (2024)**.
Bab ini membahas tentang **perulangan (looping)**, yaitu proses eksekusi instruksi program secara berulang hingga kondisi tertentu terpenuhi. Konsep perulangan merupakan salah satu pondasi logika pemrograman yang sangat penting dalam menyelesaikan perhitungan berulang.

---

## 🎯 Tujuan Pembelajaran

1. Menggunakan berbagai jenis struktur perulangan (`for`, `while`, dan `do-while`).
2. Melakukan *tracing* terhadap proses iterasi untuk memahami logika kerja loop.

---

## 🧠 Materi dan Tugas

### 🧩 **Jurnal Terbimbing**

#### 1. Mencari Bilangan Terkecil `n` Sehingga `n³ > Input`

Mahasiswa diminta membuat program untuk mencari bilangan bulat terkecil `n` yang memenuhi syarat `n³ > inputan`.
Program harus melakukan perhitungan dari `n = 1` ke atas hingga menemukan nilai yang sesuai.
Latihan ini bertujuan untuk melatih penggunaan struktur **perulangan bertahap** dan **pengujian kondisi** dalam loop.

**Contoh Kasus:**

* Input: `12000`
* Output: `n = 23`, karena `23³ = 12167 > 12000`.

---

#### 2. Penjumlahan Bilangan Genap dari 1 hingga N

Mahasiswa membuat program untuk menghitung **jumlah seluruh bilangan genap** dari `1` hingga `N` yang dimasukkan pengguna.
Latihan ini mengajarkan penggunaan **loop dan operator modulus (%)** untuk memfilter bilangan tertentu dalam sebuah rentang nilai.

---

#### 3. Menentukan Bilangan Prima

Mahasiswa membuat program untuk menentukan apakah sebuah angka merupakan **bilangan prima** atau bukan.
Bilangan prima adalah angka yang **hanya dapat dibagi habis oleh 1 dan dirinya sendiri**.
Latihan ini menekankan pada konsep **loop bersarang** (nested loop) dan penggunaan kondisi logika untuk memeriksa hasil pembagian berulang.

**Contoh Kasus:**

* Input: `10` → Output: “10 bukan bilangan prima”
* Input: `11` → Output: “11 adalah bilangan prima”

---

### 🧩 **Jurnal Mandiri**

#### 1. Menentukan Daftar Bilangan Prima dari 1 hingga N

Mahasiswa memodifikasi program pada jurnal terbimbing nomor 3 agar dapat menampilkan **semua bilangan prima dari 1 hingga N**.
Latihan ini melatih kemampuan **perulangan bertingkat** dan **pemeriksaan kondisi berulang** untuk setiap angka dalam rentang tertentu.

---

#### 2. Game Tebak Angka (0–100)

Mahasiswa membuat program permainan sederhana di mana komputer akan **menghasilkan angka acak antara 0–100**, kemudian pengguna harus menebaknya.

Setiap kali pengguna memberikan tebakan:

* Jika tebakan **lebih kecil** dari nilai acak → tampilkan pesan “Nilai yang anda masukkan lebih kecil”.
* Jika tebakan **lebih besar** → tampilkan “Nilai yang anda masukkan lebih besar”.
* Jika tebakan **benar** → tampilkan pesan “Tebakan yang bagus! Anda berhasil menebaknya dalam N kali tebakan.”

Latihan ini memperkenalkan penggunaan:

* **Loop do-while** untuk menjalankan perulangan sampai kondisi benar,
* **Percabangan bersyarat** untuk memberi umpan balik dinamis,
* Dan penggunaan **class Random** untuk menghasilkan angka acak.

---

## ⚙️ Bahasa Pemrograman

Seluruh latihan dikerjakan menggunakan **bahasa Java**, dengan fokus pada:

* Struktur perulangan (`for`, `while`, `do-while`)
* Logika percabangan (`if`, `else if`, `else`)
* Operator aritmatika dan logika
* Input/output menggunakan kelas `Scanner`
* Penggunaan `Random` untuk pembuatan nilai acak

---

## 💡 Kesimpulan

Bab ini membahas konsep **perulangan (looping)** yang menjadi inti dari banyak algoritma pemrograman.
Melalui latihan yang diberikan, mahasiswa belajar bagaimana mengontrol alur eksekusi berulang untuk memecahkan berbagai permasalahan logika seperti pencarian nilai, perhitungan deret, dan permainan interaktif sederhana.
Pemahaman yang baik tentang perulangan akan menjadi dasar penting sebelum mempelajari struktur data dan algoritma yang lebih kompleks.
