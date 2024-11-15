import { Autor } from "./autor";

export interface Book {
    bookId:         number;
    about:          string;
    author:         Autor;
    cover:          string;
    genre:          string;
    subGenre:       string;
    name:           string;
    url:            string;
    likes:          number;
    readGlobalTime: string;
    createdAt:      Date;
    updatedAt:      Date;
    isActive:       boolean;
}
