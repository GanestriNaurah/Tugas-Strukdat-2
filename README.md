# Class Diagram Makanan Lebaran

## Deskripsi Kasus
Class diagram ini mendeskripsikan tentang makanan lebaran. Pada momen lebaran, berbagai jenis makanan dihidangkan, dimulai dari makanan berat hingga kue. Dan setiap makanan pasti memiliki resep yang berbeda-beda. Kita pasti ingin tahu cara pembuatan seperti apa sehingga kita bisa membuat makanan yang kita inginkan (tidak perlu menunggu momen hari raya terlebih dahulu).
Berdasarkan hal tersebut, dibuatlah sistem berbasis Object-Oriented Programming (OOP) untuk merepresentasikan konsep diagram tersebut agar hubungan antara makanan dan resep menjadi lebih jelas serta lebih terorganisir.

## Prinsip-prinsip OOP
1. **Inheritance** : Class Makanan Utama dan KueKering merupakan subclass (derived class atau turunan) dari MakananLebaran (base class). Digunakan untuk mengelompokkan kategori makanan lebaran.
2. Encasuplation : Data pada class Resep seperti bahan dan langkah disimpan dalam atribut private sehingga hanya bisa diakses dalam class tersebut saja.
3. Polymorphism : Method tampilkanInfo() di-override pada subclass untuk memberikan output yang berbeda sesuai kategori makanan
4. Association : Base class memiliki relasi dengan class resep, di mana satu makanan memiliki satu resep.

## Keunikan Program
Pada program ini, nama dan kategori makanan akan langsung keluar beserta dengan resep (1 makanan 1 resep) sehingga tidak akan bergabung satu sama lain (semisal : keluar semua makanan dulu, baru resep). Hal ini akan mengefisiensi user untuk mencari makanan yang diinginkan beserta resep makanannya.
Artinya, program ini tidak hanya memisahkan kategori makanan menggunakan inheritance, tetapi juga menghubungkan setiap makanan dengan resepnya secara langsung menggunakan association.
