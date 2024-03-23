## Analisa Duck

---
* Menerapkan strategi pattern dapat memisahkan perilaku bersuara dan terbang menjadi objek yang berbeda
* Pada program ini kita membuat beberapa class untuk mengimplementasikan method yang ada pada 2 interface yang kita buat
* Dan dengan menggunakan Desaign Pattern kita dapat membuat isi yang beda pada method yang sama dengan cara mengimplementasikan method dengan class lain
* Pada ModelDuck kita menetapkan nilai FlyBehavior menjadi FlyNoWay dan kita juga menerapkan quackBehaviior menjadi MuteQuack sehingga ketika dipanggil maka yang muncul adalah Tidak bisa terbang dan tidak bisa bersuara


## Analisa Tugas Strategi Pattern

---
* Pada awalnya programnya menggunakan if else untuk menampilkan berdasarkan apa yang dipanggil
* Namun jika tiba tiba ada penambahan maka akan sulit karena akan banyak yang diubah nah maka dari itu kita menggunakan strategi pattern
* Pada program yang sudah menggunakan strategi pattern kita membuat interface punch yang berisi satu Abtract method yaitu punchAction dan interface Kick yang berisi method KickAction
* Jadi jika ingin menambahkan misalnya gaya tendangan baru kita tinggal membuat method baru tanpa harus memikirkan logika untuk membuat sebuah pengkondisian