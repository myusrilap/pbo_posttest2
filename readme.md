Nama: Muhammad Yusril Arjulio Prayitno
NIM: 2209116065

Tema coding:
Codingan terdiri dari 2 package yaitu pemilik sebagai package utama yang mempunyai 1 class yaitu admin dan package baru yaitu penyewa yang mempunyai 1 class yaitu penghuni.

penjelasan coding




<img width="413" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/b4a0a969-646b-4b8f-960a-2f344d658c0d">

coding diatas merupakan class Java yang disebut Penghuni di dalam pakcage penyewa. class ini memiliki tiga variabel instance (nama, umur, dan nomorKamar) yang digunakan untuk menyimpan informasi seorang penghuni, dan memiliki sebuah constructor untuk menginisialisasi objek Penghuni dengan nilai-nilai yang diberikan saat objek dibuat.

<img width="341" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/d6fd6ee3-8ab4-4ee0-be1c-ee9c2149141a">

line ini merupakan method-method di kelas Penghuni digunakan untuk mengakses dan mengubah nilai properti properti nama, umur, dan nomor kamar. Method-method setter ini memungkinkan perubahan data penghuni, sedangkan method-method getter digunakan untuk mendapatkan informasi tentang penghuni. Dengan cara ini, nilai properti dapat diakses dan diubah sesuai kebutuhan.

<img width="206" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/db334a55-232d-4617-b4af-41a46934fe4d">

line ini mendeklarasikan package "pemilik" dan mengimpor class "Penghuni" dari package "penyewa". Juga, digunakan ArrayList dan Scanner dari Java.

<img width="503" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/8931dadf-fc78-47c7-a7b1-419394fb19cf">

Dalam class "Admin", ada variabel statis daftarPenghuni yang merupakan ArrayList untuk menyimpan objek Penghuni.

<img width="447" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/12e56053-1a98-4634-9455-fcc376fef642">

<img width="327" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/9bb9f2c8-4d62-45b4-b056-0ca5b0dba2db">

ini merupakan main method yang menangani logika utama program dengan menampilkan menu pilihan untuk tambah, tampilkan, edit, hapus, atau keluar. Program dijalankan dalam loop do-while hingga pengguna memilih keluar.

<img width="445" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/302e190d-0efe-40ff-b42a-00daf9c9321e">

Fungsi tambahPenghuni() meminta input pengguna untuk nama, umur, dan nomor kamar, membuat objek Penghuni baru, dan menambahkannya ke daftarPenghuni.

<img width="506" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/c551c70d-3375-4d10-9818-51f27d6962cc">

Fungsi tampilkanDaftarPenghuni() menampilkan informasi setiap penghuni, termasuk nama, umur, dan nomor kamar.

<img width="518" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/34baaf06-bf81-4db6-ba04-6fde0698b197">

<img width="570" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/05f5d86d-f05c-4166-9cde-e19ee4a80584">

Fungsi editPenghuni() memungkinkan pengguna mengubah informasi penghuni berdasarkan nomor kamar. Jika penghuni ditemukan, nama, umur, dan nomor kamar dapat diubah.

<img width="569" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/855ef0f0-a2a8-4cd6-934e-02af410a2192">

Fungsi hapusPenghuni() memungkinkan pengguna menghapus penghuni berdasarkan nomor kamar.

Output 

1. Menu

<img width="152" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/fa63c482-1c14-4b3f-8c8d-6e9beebc97bc">

2. Tambah penghuni

<img width="128" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/c0a800e8-eedf-486a-897b-6f139141f489">

3. Tampilkan daftar penghuni

<img width="149" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/2a35e124-92ec-4a3b-8887-f4a5b2c3937e">

4. Edit penghuni

<img width="220" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/73329de6-ea74-4ac6-861e-9d1d6ba5e1a5">

5. Hapus penghuni

   <img width="221" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/925a61d3-1664-429c-bea0-9e03444dd487">

6. Keluar

<img width="380" alt="image" src="https://github.com/myusrilap/pbo_posttest2/assets/126448864/92f13cea-a3c4-4b74-9f75-59d84a728c49">








