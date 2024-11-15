export interface DataList <T>{
    data:          T[];
    totalElements: number;
    pageNumber:    number;
    totalPages:    number;
    first:         boolean;
    last:          boolean;
}
