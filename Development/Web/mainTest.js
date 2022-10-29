//alert("Hello World");
//console.log('Hello World');
let score;
score = 10;
const score11 = 110;
const name1 = "Joel";
const atrue = true;
const x = null;
const y = undefined;

//console.log(score1);
// console.log(score1);
// console.log(name  );
// console.log(atrue );
// console.log(x     );
// console.log(y     );

//console.log(typeof x);

const score1 = 110;
const name = "Joel";

// console.log(score1+name1);
// console.log(`My name is ${name1} and my gae is ${score1}`);
const tempString = `My name is ${name1} and my gae is ${score1}`;
//console.log(tempString);

//console.log(tempString.substring(0,5).toLocaleUpperCase());
//console.log(tempString.split(''));

const arr = "monday,tuesday,wednesday";
//console.log(arr.split(','));

const numbers = new Array(1, 2, 3, 4, 5, 6);
//console.log(numbers);

const arr1 = ["monday", "tuesday", "wednesday", 10, true];
//console.log(arr1);

//console.log(arr1[2])
arr1.push("Joel");
//console.log(arr1);

arr1.unshift("Joel");
//console.log(arr1);

arr1.pop("Joel");
//console.log(arr1);

//console.log(arr1.indexOf(10));

const Person = {
  fname: "Joel",
  lname: "Abraham",
  address: {
    street: "kzy",
    home: 213,
  },
  state: "active",
  hobbies: ["cycling", "photography"],
};
//console.log(Person);
//console.log(Person.address.street);

const {
  fname,
  hobbies,
  address: { street },
} = Person;
//console.log(fname);

Person.email = "j@j.com";
//console.log(Person);

const todos = [
  { id: 1, text: "Take out TRASH", flag: true },
  { id: 2, text: "Buy specs", flag: false },
  { id: 3, text: "Pay CC", flag: false }
];

const todoJSON = JSON.stringify(todos);
//console.log(todoJSON);

let i=10;

for(i=0;i<10;i++)
{
    //console.log(`For loop number ${i}`);
}

while(i>=1){
    
    //console.log(`While loop number ${i}`);
    i--;
}

console.log(i);

for(i=0;i<todos.length;i++)
{
    //console.log(`For loop number ${todos[i]}`);
}

// for(let todos of todos)
// {
//     console.log(todos.id)
// }

todos.forEach(function(todos){
    //console.log(todos.text);
});

const mapDeezNutz = todos.map(function(todos){
    //console.log(todos.text);
});

//console.log(mapDeezNutz);

const mapDeezFilter = todos.filter(function(todos){
    return todos.state === true;
});

console.log(mapDeezFilter);