// Hands-on 1: Higher-Order Function
// Tugas: Lengkapi fungsi `calculate` yang menerima dua angka dan sebuah
// fungsi `operation` (Int, Int) -> Int, lalu jalankan `operation` terhadap
// kedua angka tersebut. Panggil `calculate` dengan beberapa lambda berbeda
// (tambah, kurang, kali) tanpa mengubah signature-nya.

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    // TODO 1: Panggil `operation` dengan a dan b, lalu kembalikan hasilnya
    // TODO("Belum diimplementasikan")
    return operation(a, b)
}

fun main() {
    // TODO 2: Panggil calculate(10, 4, ...) dengan lambda penjumlahan -> harus mencetak 14
    // TODO 3: Panggil calculate(10, 4, ...) dengan lambda pengurangan -> harus mencetak 6
    // TODO 4: Panggil calculate(10, 4, ...) dengan lambda perkalian -> harus mencetak 40

    val tambah = calculate(10, 4) { x, y -> x + y }
    println("Tambah: $tambah")

    val kurang = calculate(10, 4) { x, y -> x - y }
    println("Kurang: $kurang")

    val kali = calculate(10, 4) { x, y -> x * y }
    println("Kali: $kali")
}
