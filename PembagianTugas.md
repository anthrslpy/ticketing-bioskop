Pembagian Tugas Project Akhir (Updated)

Anasya Laili Rahmadani (245150200111013)
- Tampilan home (ViewHome)
- Tampilan detail film (ViewFilm)
- Tampilan register customer dan admin (ViewRegister & RegisterAdmin) 
- Tampilan muka admin, delete film (ViewAdmin)

Nayla Masyitha Ramadhani (245150200111016)
- Tampilan pilih jadwal (PilihStudio)
- Tampilan pilih kursi (PilihKursi)
- Tampilan add film admin (AdminAddFilm)
- Tampilan add jadwal admin (AdminAddJadwal)

Rasyadillah Putra Mayantara (245150207111018)
- Tampilan login untuk user (Login)
- Tampilan payment (ViewPayment)

**Perubahan yang dilakukan**
- Register dan login untuk customer dan admin dipisahkan -> dibagi menjadi ViewRegister-Login & RegisterAdmin-LoginAdmin, serta penambahan button khusus untuk menuju halaman admin
- Flow program diubah: register/login untuk customer dilakukan setelah mereka ingin pesan tiket (ViewHome -> ViewFilm -> Register/Login -> PilihStudio dst.)
