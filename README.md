## Implementation of the Set CRUDs using TDD methodology

### TDD: test-driven development

TDD (test-driven improvement) is known as a strategy for composing unit tests.

#### Just a little insides about TDD methodology and what means the Red-Green Refactor: test-driven development principles

TDD requires you to design your code before implementing it. TDD forces you to consider your components' behavior before
writing them. Additionally, it helps you stay focused on the message you want to convey. In test-driven development (
TDD), you create tests for your method or implementation to validate its intended behavior.

Keep in mind that TDD always results in your test failing first. There is no functionality because the code has not yet
been written. This is advantageous!
It demonstrates that not just any implementation will pass your test!

Next, you must demonstrate that the test will succeed if the implementation is correct and accomplishes its goal. You
can change your code to make it better and clearer once you have verified that your test fails when the implementation
is incorrect and passes when it is correct. Refactoring will be lot simpler because the test is already there, and you
can do it knowing that your tests will confirm whether your changes to the code's behavior were successful. Red-green
refactoring is the term for this.

### Red:

First, you make your test fail.

### Green:

Then, make it pass.


Refactor after testing. Your code will be clear and prepared for production thanks to this. I want to underline that 
before you make your code great, it's crucial to truly go through red and green. The red stage will confirm that your 
test won't always be a pass. Later, when circumstances become more complicated, you can be confident that it is deterministic.
Later, at the green stage, your priority should be "How can I develop code that meets the requirements?" rather than 
"How can I write the best code?" Consider this the opportunity to demonstrate that your test passes for the legitimate 
use cases. You will have the opportunity to review your code during the subsequent stage, refactoring.

You may build better, more intelligent code and make adjustments throughout the refactoring phase. Often, when 
engineers begin writing, they lose sight of the purpose of their work. Sometimes developers write tests while 
they are developing the implementation, which results in unforeseen defects. TDD aids in avoiding those errors.

![Alt text](descărcare_(1).png?raw=true "Red-Green Refactoring")

## Methods from MySet.class:

#### add(T item)

#### contains(T item)

#### isEmpty()

#### removeElement(T item)