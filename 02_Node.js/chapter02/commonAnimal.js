const animals = ['dong', 'cat'];

function showAnimals(){
    animals.map(function(el) {
        console.log(el);
    });
}

module.exports = {
    animals,
    showAnimals,
};