function calculateFD() {
    const amount = document.getElementById("amount").value;
    const rate = 7.25;
    const years = 3;

    const maturity = amount * (1 + (rate / 100) * years);

    document.getElementById("rate").innerText = rate + "%";
    document.getElementById("maturity").innerText = "₹ " + maturity.toFixed(0);
}
document.getElementById("calculateBtn").addEventListener("click", calculateFD);