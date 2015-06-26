#!/usr/bin/env python

'''Implementation of top-down MergeSort, using in-place array merges.'''

import sys

def stdin_to_ints(stream):
    clean_str = [x.replace('\n', '') for x in stream.next().split(' ')]
    return [int(x) for x in clean_str]

def less(n, m):
    return n < m

def merge(a, lo, mid, hi):
    temp = []
    for num in a:
        temp.append(num)

    j = lo
    k = mid + 1
    for ix, num in enumerate(a):
        if j > mid:
            a[ix] = k
            k += 1
        if k > hi:
            a[ix] = j
            j += 1
        elif less(j, k):
            a[ix] = j
            j += 1
        else:
            a[ix] = k
            k += 1

def sort(a, lo, hi):
    if lo == hi:
        return
    mid = lo + (hi - lo) / 2
    sort(a, lo, mid)
    sort(a, mid + 1, hi)
    merge(a, lo, mid, hi)

def sort_array(a):
    return sort(a, 0, len(a) - 1)

def is_sorted(a):
    i = 1
    while i < len(a):
        if less(a[i], a[i-1]):
            return False
        i += 1
    return True

if __name__ == '__main__':

    a = stdin_to_ints(sys.stdin)

    print 'Array before:'
    print a

    sort_array(a)

    print 'Array after:'
    print a

    print is_sorted(a)
