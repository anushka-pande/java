#include <stdio.h>
int main()
{
    int i, j, k, n, m;
    int mat[10][10];
    printf("Enter number of rows:");
    scanf("%d", &n);
    printf("Enter number of columns:");
    scanf("%d", &m);
    printf("Enter elements of matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            scanf("%d", &mat[i][j]);
        }
    }
    printf("Original matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            printf("%d ", mat[i][j]);
        }
        printf("\n");
    }
    int transpose[10][10];
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            transpose[j][i] = mat[i][j];
        }
    }
    printf("Transpose of a given matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            printf("%d ", transpose[i][j]);
        }
        printf("\n");
    }
    int mul[10][10];
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            mul[i][j] = 0;
            for (k = 0; k < m; k++)
            {
                mul[i][j] += mat[i][k] * transpose[k][j];
            }
        }
    }
    printf("Multiplication of the matrix and its transpose:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            printf("%d ", mul[i][j]);
        }
        printf("\n");
    }
    return 0;
}