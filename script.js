function varExample(){
    console.log('--- var example ---');
    console.log(introvert);
    var introvert ='Ram is a introvert';
    
    var a =10;
    if(true){
        var a =20;
        console.log(a);

    }
    console.log(a);
    for (var i=0;i<3;i++){
        console.log(i);
    }
    console.log('i after loop:', i);
}

function letExample() {
  console.log('--- let example ---');
  // console.log(blockScopedLet); // Throws ReferenceError: Cannot access 'blockScopedLet' before initialization (TDZ)
  let blockScopedLet = 'I am not hoisted';

  let b = 10;
  if (true) {
    let b = 20; // This is a NEW variable 'b', scoped only to this if-block
    console.log(b); // Outputs: 20
  }
  console.log(b); // Outputs: 10 (The original 'b' is unaffected)

  for (let j = 0; j < 3; j++) {
    console.log(j);
  }
  // console.log(j); // Throws ReferenceError: j is not defined (j is not accessible outside the loop)
}

function constExample(){
    console.log('--- const example ---');
    const pi =3.4;

    const personDetail ={
        name : 'Mahesh pattanaik',
        time : 19 
     };

     personDetail.time =20;
     console.log(personDetail.name);
     console.log(personDetail.time)
}

varExample();
letExample();
constExample();