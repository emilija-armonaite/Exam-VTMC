// display paragraphs


document.getElementById("firstProfile").innerHTML = "Java Programuotoja";
document.getElementById("firstParagraph").innerHTML = "Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.";

document.getElementById("secondProfile").innerHTML = "JavaScript Programuotojas";
document.getElementById("secondParagraph").innerHTML = "Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.";

document.getElementById("thirdProfile").innerHTML = "PHP Programuotoja";
document.getElementById("thirdParagraph").innerHTML = "Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.";


// newsletter submit form

let submitForm = document.getElementById("submitForm");

submitForm.addEventListener("submit", function(e) {
    e.preventDefault();
    swal({
        icon: "success",
        title: "Sveikinu! Pats geriausias naujienlaiškis užsakytas!"
    })
});