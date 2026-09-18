public class Day17 {
    public static void main(String[] args) {
        // 1. Operator penugasan dasar (=)
        int angka = 10;
        System.out.println("Nilai awal angka: " + angka);
        
        // 2. Penugasan Penambahan (+=)
        angka += 5; // Artinya: angka = 10 + 5
        System.out.println("Setelah angka += 5 : " + angka); // Output: 15
        
        // 3. Penugasan Pengurangan (-=)
        angka -= 4; // Artinya: angka = 15 - 4
        System.out.println("Setelah angka -= 4 : " + angka); // Output: 11
        
        // 4. Penugasan Perkalian (*=)
        angka *= 3; // Artinya: angka = 11 * 3
        System.out.println("Setelah angka *= 3 : " + angka); // Output: 33
        
        // 5. Penugasan Pembagian (/=)
        angka /= 5; // Artinya: angka = 33 / 5 (karena tipe int, hasilnya dibulatkan ke bawah jadi 6)
        System.out.println("Setelah angka /= 5 : " + angka); // Output: 6
        
        // 6. Penugasan Modulus (%=)
        angka %= 4; // Artinya: angka = 6 % 4 (sisa bagi dari 6 dibagi 4 adalah 2)
        System.out.println("Setelah angka %= 4 : " + angka); // Output: 2
    }
