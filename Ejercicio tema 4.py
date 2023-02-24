fn main() {
    let numero_if: i32 = -1;
    if numero_if > 0 {
        println!("El número es positivo.");
    } else if numero_if < 0 {
        println!("El número es negativo.");
    } else {
        println!("El número es cero.");
    }

    let mut numero_while: i32 = 0;
    while numero_while < 3 {
        numero_while += 1;
        println!("{}", numero_while);
    }

    let mut numero_do_while: i32 = 0;
    loop {
        numero_do_while += 1;
        println!("{}", numero_do_while);
        if numero_do_while >= 3 {
            break;
        }
    }

    for numero_for in 0..=3 {
        println!("{}", numero_for);
    }

    let estacion = "verano";
    match estacion {
        "primavera" => println!("Estamos en primavera."),
        "verano" => println!("Estamos en verano."),
        "otoño" => println!("Estamos en otoño."),
        "invierno" => println!("Estamos en invierno."),
        _ => println!("No es una estación válida."),
    }
}
