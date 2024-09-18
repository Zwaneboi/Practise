
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <time.h>
#include <unistd.h>
#include <sys/ipc.h>
#include <sys/shm.h>
void *calc();
void *count();

int main() {
    pthread_t thread1;
    pthread_t thread2;
     
    pthread_create(&thread1, NULL, calc, NULL);
    pthread_create(&thread2, NULL, count, NULL);
    printf("Parent: Threads created\n");
    
    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);
    
    return 0;
}

void *calc(){
    
    int sum = 5;
    sum += 100;
    sum += 2999 - 12;
    sum += 2000;
    for(int i = 0; i < 5000; i++){
        sum -= 1;
    }
    printf("Thread 1 complete\n");
   
    return NULL;
}

void *count(){
  
    int sum = 13;
    sum -= 3000;
    sum += 203;
    printf("Thread 2 complete\n");
  
    return NULL;
}
