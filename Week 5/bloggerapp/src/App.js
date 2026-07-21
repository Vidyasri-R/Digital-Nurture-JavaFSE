import React, { Component } from 'react';
import './App.css';

export const books = [
    { id: 101, bname: 'Master React', price: 670 },
    { id: 102, bname: 'Deep Dive into Angular 11 ', price: 800 },
    { id: 103, bname: 'Mongo Essentials', price: 450 },
];

const blogs = [
    { id: 1, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { id: 2, title: 'Installation', author: 'Schwezdenier', content: 'You can install React from npm.' },
];

const courses = [
    { id: 1, name: 'Angular', date: '4/5/2021' },
    { id: 2, name: 'React', date: '6/3/2021' },
];

class App extends Component {
    render() {
        const bookdet = (
            <ul>
                {books.map((book) =>
                    <div key={book.id}>
                        <h3> {book.bname}</h3>
                        <h4>{book.price}</h4>
                    </div>
                )}
            </ul>
        );
        const content = (
            <ul>
                {blogs.map((blog) =>
                    <div key={blog.id}>
                        <h3>{blog.title}</h3>
                        <p><i>{blog.author}</i></p>
                        <p>{blog.content}</p>
                    </div>
                )}
            </ul>
        );
        const coursedet = (
            <ul>
                {courses.map((course) =>
                    <div key={course.id}>
                        <h3>{course.name}</h3>
                        <p>{course.date}</p>
                    </div>
                )}
            </ul>
        );
        return (
            <div>
                <div>
                    <div className="st2">
                        <h1> Book Details</h1>
                        {bookdet}
                    </div>
                    <div className="v1">
                        <h1> Blog Details</h1>
                        {content}
                    </div>
                    <div className="mystyle1">
                        <h1> Course Details</h1>
                        {coursedet}
                    </div>
                </div>
            </div>
        );
    }
}
export default App;
