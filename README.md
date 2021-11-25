# ComicList
A simple android application to browse comics of [xkcd comics](https://xkcd.com/). This app will show
- list of comics
- comic details
- favorite comic list
- search for a comic by number or title.

## project structure
This project implements clean architecture, MVVM structure pattern, Retrofit for APIs, Room for local database, Coroutines, LiveData and DataBinding.

## The app has the following packages
1. **common**: It contains all the base classes of the application.
2. **data**: It contains the database, shared preference, network classes of the application.
3. **di**: It contains setup of koin dependency injection.
4. **feature**: It contains the packages of each feature in the application. Each feature contains two packages, one for module and one for screens.
5. **utils**: It contains the utils classes of the application.


## License
```
   Copyright (C) 2019 Harish Dadi

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
