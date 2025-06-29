//Select DOM element once and store theme in constants.
//we use 'const' these reference to the html elements will not change
 const todoForm = document.getElementById('todo-form');
 const todoInput = document.getElementById('todo-input');
 const todoList = document.getElementById('todo-list');
 
 const todos =[];

 let todoIdCounter =1;

todoForm.addEventListener('submit', function(event) {
    
    event.preventDefault();
     
    const todoText = todoInput.value.trim();

    if (todoText !== ''){
        const newTodo = {
            id: todoIdCounter++,
            text: todoText,
            completed: false
        };
        todos.push(newTodo);
        const listItem = document.createElement('li');
        listItem.textContent = todoText;
        todoList.appendChild(listItem);

        todoInput.value = '';
    }
});
