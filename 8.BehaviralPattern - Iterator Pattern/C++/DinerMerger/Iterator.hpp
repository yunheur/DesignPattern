#ifndef	_HEAD_FIRST_DESIGN_PATTERNS_ITERATOR_DINER_MERGER_ITERATOR_HPP_
#define _HEAD_FIRST_DESIGN_PATTERNS_ITERATOR_DINER_MERGER_ITERATOR_HPP_

namespace DinerMerger {

template <class T>
class Iterator {
	public: virtual bool hasNext() = 0;
	public: virtual T* next() = 0;
};

} // namespace DinerMerger

#endif